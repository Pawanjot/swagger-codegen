# BSB Swagger Code Generator

## Building

Please build as: ./sbt assembly

## Running

Ensure you have Scala installed on the computer. Then run:

./bin/codegen

To Generate the C# SDK, run:

PLATFORM=Unity ./bin/codegen

Fixes done:
* Update to allow model name that starts with lower case
src/main/scala/com/wordnik/swagger/codegen/spec/SwaggerSpecValidator.scala  getUpdatedType()
