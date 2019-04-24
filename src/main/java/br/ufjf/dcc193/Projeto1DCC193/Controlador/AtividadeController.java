package br.ufjf.dcc193.Projeto1DCC193.Controlador;

import br.ufjf.dcc193.Projeto1DCC193.Repositorio.AtividadeRepository;
import br.ufjf.dcc193.Projeto1DCC193.Modelo.Atividades;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AtividadeController {

    @Autowired
    private AtividadeRepository repatividade;

 

    @RequestMapping("formularioatividades.html")
    String form() {
        return "formularioatividades";
    }

    @RequestMapping("addatividades.html")
    ModelAndView novo(Atividades a) {
       ModelAndView mv = new ModelAndView();
        mv.setViewName("listaatividades");
        repatividade.save(a);
        List<Atividades> atividadess = repatividade.findAll();
        mv.addObject("atividadess", atividadess);
        return mv;
    }

    @RequestMapping("listaatividades.html")
        ModelAndView listaatividadess() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("listaatividades");
        List<Atividades> sd = repatividade.findAll();
        mv.addObject("listased", sd);
        return mv;
    }

}