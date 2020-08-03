package com.geektrust;

import com.geektrust.util.Utility;

import java.io.IOException;
import java.util.List;

/**
 * Main source class which will get input file as argument and will print the result.
 */
public class Geektrust {
    Solver solver;

    public static void main(String[] args) throws IOException {
        // Taking path from first argument.
        String path = args[0];

        // Creating object to get relevant data, since main context is static.
        Geektrust geektrust = new Geektrust();

        // Getting input file's data as list.
        List<String> inputLines = Utility.getInputLinesAsList(path);

        // Solving problem, getting allies.
        geektrust.solver = new Solver();
        geektrust.solver.init(inputLines);
        String output = geektrust.solver.solveAndGetAlliancesName();

        // Printing result.
        System.out.print(output);
    }
}