package majestatyczne.bestie.rewardsmanager.util;

import lombok.Getter;
import majestatyczne.bestie.rewardsmanager.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class ParsedData {

    private final Quiz quiz = new Quiz();

    private final List<Person> people = new ArrayList<>();

    private final List<Preference> preferences = new ArrayList<>();

    private final List<Result> results = new ArrayList<>();

    private final List<Reward> rewards = new ArrayList<>();
}
