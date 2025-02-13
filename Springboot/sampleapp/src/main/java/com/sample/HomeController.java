package com.sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class HomeController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ItemService itemService;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "home";
    }

    @GetMapping("/addCustomer")
    public String addCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "addCustomer";
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@ModelAttribute Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("/addItem")
    public String addItemForm(Model model) {
        model.addAttribute("item", new Item());
        model.addAttribute("customers", customerService.getAllCustomers());
        return "addItem";
    }

    @PostMapping("/addItem")
    public String addItem(@ModelAttribute Item item) {
        itemService.saveItem(item);
        return "redirect:/customers";
    }
}