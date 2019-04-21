package br.ufjf.dcc193.Projeto1DCC193.Controlador;

import java.util.List;
import br.ufjf.dcc193.Projeto1DCC193.Repositorio.SedeRepository;
import br.ufjf.dcc193.Projeto1DCC193.Modelo.Sede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
 public class SedeController {

@Autowired
private SedeRepository repsede;   

@RequestMapping("sede.html")
ModelAndView sede(Sede s){
ModelAndView mv = new ModelAndView();
mv.setViewName("sede");
mv.addObject("sede",s);
return mv;
}


}