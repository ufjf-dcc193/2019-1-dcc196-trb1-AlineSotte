package br.ufjf.dcc193.Projeto1DCC193.Controlador;

import br.ufjf.dcc193.Projeto1DCC193.Modelo.Membros;
import br.ufjf.dcc193.Projeto1DCC193.Repositorio.MembrosRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MembrosController {

    @Autowired
    private MembrosRepository repmebros;

   

    @RequestMapping("formulariomembro.html")
    String form() {
        return "formulariomembro";
    }

    @RequestMapping("addmembros.html")
    ModelAndView novo(Membros m) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("listamembros");
        repmebros.save(m);
        List<Membros> mb = repmebros.findAll();
        mv.addObject("listame", mb);
        return mv;
    }

    @RequestMapping("listamembros.html")
    ModelAndView listaSedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("listamembros");
        List<Membros> mb = repmebros.findAll();
        mv.addObject("listmb", mb);
        return mv;
    }

}