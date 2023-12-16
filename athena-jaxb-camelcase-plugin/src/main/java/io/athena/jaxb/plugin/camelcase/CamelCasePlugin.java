package io.athena.jaxb.plugin.camelcase;

import com.sun.tools.xjc.BadCommandLineException;
import com.sun.tools.xjc.Options;
import org.jvnet.jaxb.plugin.AbstractPlugin;

/**
 * JAXB camel-case plugin. Makes sure that if a Java class name is generated from a XSD element the name will be in
 * camel-case. This means that each identified word will start with an upper character and have lower case characters
 * for the remaining part.
 */
@SuppressWarnings("unused")
public class CamelCasePlugin extends AbstractPlugin {

    private static final String OPTION_NAME = "XCamelCase";

    @Override
    public void onActivated(Options options) throws BadCommandLineException {
        options.setNameConverter(new CamelCaseNameConverter(), this);
    }

    @Override
    public String getOptionName() {
        return OPTION_NAME;
    }

    @Override
    public String getUsage() {
        return "  -" + OPTION_NAME + "    :  Converts every XML name that represents a Java class to camel-case.";
    }

}
