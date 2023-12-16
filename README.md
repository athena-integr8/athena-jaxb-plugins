# Athena JAXB Plugins

## Purpose
This repository contains some extra JAXB/XJC plugins that can be used in combination with the 
[Highsource JAXB Maven plugin](https://github.com/highsource/jaxb-tools). Highsource JAXB Maven plugin
is a great JAXB/XJC plugin that has support for JAXB 4.0 and Jakarta.

Currently the following plugins are available:

- **CamelCase**. This plugin makes sure that each generated class will have Java camel-case names.


- **Episode**. Replaces the default episode plugin to support mapping. This way you can even have multiple xsd schemas 
with the same target namespace and still have them generated in separate projects/modules.

