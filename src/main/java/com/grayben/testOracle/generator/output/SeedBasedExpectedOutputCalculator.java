package com.grayben.testOracle.generator.output;

import com.grayben.testOracle.generator.SeedBasedCalculator;

import java.util.function.Function;

/**
 * Created by beng on 13/01/2016.
 */
public abstract class SeedBasedExpectedOutputCalculator<S, O>
        extends SeedBasedCalculator<S, O>
        implements ExpectedOutputCalculable<S, O> {

    public final O calculateExpectedOutput(S seed) {
        return this.generateResult(seed);
    }

    @Override
    protected final Function<S, O> generateSeedToResultFunction() {
        return this.generateSeedToExpectedOutputFunction();
    }

    protected abstract Function <S, O> generateSeedToExpectedOutputFunction();
}
