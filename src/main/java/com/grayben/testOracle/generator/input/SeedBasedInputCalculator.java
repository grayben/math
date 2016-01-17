package com.grayben.testOracle.generator.input;

import com.grayben.testOracle.generator.SeedBasedCalculator;

import java.util.function.Function;

/**
 * Created by beng on 13/01/2016.
 */
public abstract class SeedBasedInputCalculator<S, O>
        extends SeedBasedCalculator<S, O>
        implements InputCalculable<S, O> {

    @Override
    public final O calculateInput(S seed) {
        return this.generateResult(seed);
    }

    @Override
    protected final Function<S, O> generateSeedToResultFunction() {
        return this.generateSeedToInputFunction();
    }

    protected abstract Function <S, O> generateSeedToInputFunction();
}
