package com.grayben.tools.math.function.parametric;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.function.Function;

/**
 * Created by beng on 19/01/2016.
 */
public interface ParametricEquation<T, X, Y> extends Function<T, ImmutablePair<X, Y>> {
}

