package br.ufjf.dcc193.Projeto1DCC193.Controlador;

import br.ufjf.dcc193.Projeto1DCC193.Repositorio.SedeRepository;
import br.ufjf.dcc193.Projeto1DCC193.Modelo.Sede;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SedeController {

    @Autowired
    private SedeRepository repsede;

    @RequestMapping("index.html")
    ModelAndView home(Sede home) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("home", home);
        return mv;
    }

    @RequestMapping("formulariosede.html")
    String form() {
        return "formulariosede";
    }

    @RequestMapping("addsede.html")
    ModelAndView novo(Sede s) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("listasede");
        repsede.save(s);
        List<Sede> sd = repsede.findAll();
        mv.addObject("listased", sd);
        return mv;
    }

    @RequestMapping("listasede.html")
    ModelAndView listaSedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("listasede");
        List<Sede> sd = repsede.findAll();
        mv.addObject("listased", sd);
        return mv;
    }

}