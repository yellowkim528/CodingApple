package com.example.CodingApple;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class ItemController {

  private final ItemRepository itemRepository;

  @GetMapping("/list")
  String list(Model model) {
    List<Item> result = itemRepository.findAll();
    model.addAttribute("items", result);

    var a = new Item();

    return "list.html";
  }

  @GetMapping("/write")
  String write() {

    return "write.html";
  }

  @PostMapping("/add")
  String addPost(@RequestParam String title,
                 @RequestParam Integer price) {
//    유저가 보낸거 DB에 저장해주세요

    Item item = new Item();
    item.setTitle(title);
    item.setPrice(price);
    itemRepository.save(item);

    return "redirect:/list";
  }

}
