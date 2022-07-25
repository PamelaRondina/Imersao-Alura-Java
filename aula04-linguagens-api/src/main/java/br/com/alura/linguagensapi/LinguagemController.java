package br.com.alura.linguagensapi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    //private List<Linguagem> linguagens = 
      //  List.of(
        //    new Linguagem("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
        //    new Linguagem("Python", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png", 2)
      //  );

    //@GetMapping("value=/linguagem-preferida")
    //public String processaLinguagemPreferida() {
    //    return "Oi, Java!";
    //}
    
    @Autowired
    private LInguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }

    @PostMapping("/linguagens")
    public Linguagem cadastrarLimguagem(@RequestBody Linguagem linguagem) {
        Linguagem LinguagemSalva = repositorio.save(linguagem);
        return LinguagemSalva;
    }
}

 
