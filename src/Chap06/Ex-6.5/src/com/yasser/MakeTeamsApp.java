package com.yasser;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class MakeTeamsApp {
    public static void main(String[] args) {
        out.println(makeTeams(2, 1));
        out.println(makeTeams(2, 2));
        out.println(makeTeams(3, 1));
        out.println(makeTeams(3, 2));
        out.println(makeTeams(3, 3));
        out.println(makeTeams(5, 3));
        out.println(makeTeams(5, 6));
        out.println(makeTeams(10, 6));

    }

    private static List<String> makeTeams(int groupSize, int teamSize) {
        return makeTeams(groupSize, teamSize, 1);
    }

    private static List<String> makeTeams(int groupSize, int teamSize, int level) {
        if (teamSize == 0) return Collections.singletonList("");
        else if (groupSize == 0) return Collections.emptyList();
        else {
            return Stream.concat(
                    makeTeams(groupSize - 1, teamSize - 1, level + 1)
                            .stream().map(x -> level + " " + x),
                    makeTeams(groupSize - 1, teamSize, level + 1).stream())
                    .collect(Collectors.toList());
        }
    }
}
