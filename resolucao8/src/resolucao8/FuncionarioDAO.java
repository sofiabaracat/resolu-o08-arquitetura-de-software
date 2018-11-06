

package resolucao8;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author sofia
 */@RestController
public class FuncionarioDAO {
        @PostMapping ("/Funcionario")
    public Funcionario create (@RequestBody Funcionario Funcionario){
            Funcionario.setId(UUID.randomUUID());
            return Funcionario;
    }

    @GetMapping ("/Funcionario")
    public List <Funcionario> read(){
            return Stream.of(
                    new Funcionario ("John Connor", 14),
                    new Funcionario ("Sara Connor", 32)
                    ).collect(Collectors.toList());
    } 

    @PutMapping ("/Funcionario")
    public Funcionario update(@RequestBody Funcionario Funcionario){
            Funcionario.setName(Funcionario.getName()+" -- updated!");
    }

    @DeleteMapping ("/Funcionario/{id}")
    public String delete (@PathVariable int id){
            return "deleted!";
    }

}
