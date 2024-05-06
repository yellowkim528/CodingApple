package com.example.CodingApple;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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
}
