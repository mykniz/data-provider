package ru.mykniz.datastreamer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mykniz.datastreamer.entity.DataFrame;

import java.util.List;

import static java.util.Arrays.asList;
import static ru.mykniz.datastreamer.utils.DataHelper.getRandomCode;
import static ru.mykniz.datastreamer.utils.DataHelper.getRandomPrice;

@RestController("/")
public class Controller {

    @GetMapping("/getMockDataFrames")
    public List<DataFrame> getMockData() {
        return asList(
                DataFrame.builder().code(getRandomCode()).price(getRandomPrice()).build(),
                DataFrame.builder().code(getRandomCode()).price(getRandomPrice()).build(),
                DataFrame.builder().code(getRandomCode()).price(getRandomPrice()).build(),
                DataFrame.builder().code(getRandomCode()).price(getRandomPrice()).build(),
                DataFrame.builder().code(getRandomCode()).price(getRandomPrice()).build(),
                DataFrame.builder().code(getRandomCode()).price(getRandomPrice()).build()
        );
    }
}
