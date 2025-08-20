package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {

        String palindromo = "";

        for(int i = palavra.length() -1; i >= 0; i--){

            palindromo += palavra.charAt(i);

        }

        if(!palindromo.toLowerCase().equals(palavra.toLowerCase())) {
            return false;
        }

        return true;
    }
}
