package io.pivotal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pivotal on 3/16/17.
 */
@RestController
public class InventoryScanner {

//    @Autowired
//    ItemRepo itemRepo;
//
//    @RequestMapping("/scan")
//    public InventoryItemInfo getItemInfo(){
//        itemRepo.findAll().forEach(System.out::println);
//        itemRepo.findAll().forEach((Item) -> {
//            getItemInfo(Item);
//        });
//    }
//
//    private InventoryItemInfo getItemInfo(Item i) {
//        // getItemInfo/v1
//        // store response in a InventoryItemInfo object
//        // put that into some form to return as a response to /scan
//        return null;
//    }
}
