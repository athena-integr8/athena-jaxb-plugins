package io.athena.jaxb.plugin.camelcase;

import org.glassfish.jaxb.core.api.impl.NameConverter;

/**
 * Camel-case name converter. Extends {@link NameConverter.Standard} and makes sure that each word starts with an
 * upper case character and has lower case characters for the remaining part.
 */
public class CamelCaseNameConverter extends NameConverter.Standard {

    @Override
    public String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }

}
