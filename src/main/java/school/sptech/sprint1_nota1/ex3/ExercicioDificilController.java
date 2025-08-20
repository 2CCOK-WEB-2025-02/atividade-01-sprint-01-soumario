package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable Integer n) {
        if (n <= 0) {
            return new ExercicioDificilResponse(0, 0);
        }

        Integer num1 = 0, num2 = 1, soma = num1 + num2;

        if (n == 1) {
            return new ExercicioDificilResponse(1, 1);
        }

        Integer enesimoTermo = 1;
        for (int i = 2; i <= n; i++) {
            Integer temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            soma += num2;
            enesimoTermo = num2;
        }

        return new ExercicioDificilResponse(enesimoTermo, soma);
    }
}
