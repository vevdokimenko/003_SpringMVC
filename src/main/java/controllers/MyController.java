package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @GetMapping(value = "/car")
    public ModelAndView car() {
        return new ModelAndView("car", "command", new Car());
    }

    @PostMapping(value = "/addCar")
    public String addCar(@ModelAttribute("SpringWeb")Car car, ModelMap model) {
        model.addAttribute("id", car.getId());
        model.addAttribute("name", car.getName());
        model.addAttribute("maxSpeed", car.getMaxSpeed());

        return "result";
    }

    @GetMapping(value = "/query/{carName}&{carSpeed}")
    public String getCarDetails(@PathVariable String carName, @PathVariable int carSpeed, Model model){
        model.addAttribute("carName", carName);
        model.addAttribute("carSpeed", carSpeed);
        return "car-details";
    }
}
