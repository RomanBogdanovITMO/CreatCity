package create.controller;

import create.entity.Building;
import create.entity.Map;
import create.repositories.BuildingRepository;
import create.repositories.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Controller
public class MapController {

    @Autowired
    private MapRepository mapRepository;

    @Autowired
    private BuildingRepository buildingRepository;

    @RequestMapping(value = "/home/map", method= RequestMethod.GET)
    public String ShowListMap(@ModelAttribute Map map, Model model) {
        List<Map> maps = (List<Map>)mapRepository.findAll();
        model.addAttribute("maps", maps);
        return "map_list";
    }
    @RequestMapping(value ="user/map",method = RequestMethod.GET)
    public String get(@RequestParam("id")long mapId,@ModelAttribute Map map, Model model,
                      @ModelAttribute Building building){
        Map map1 = mapRepository.findById(mapId).get();
        List<Building> buildingsList = (List<Building>)buildingRepository.findAll();
        model.addAttribute("mapOfId", map1);
        model.addAttribute("buildings",buildingsList);
        return "plaer_map";
    }
}
