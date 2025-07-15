# datapod-for-react-scala-json

This is a simple datapod template for a local site that displays data from a JSON file, which is created by a Scala script that parses a text file.

## Howto

nnn

## Setup

- Ubuntu (WORKED)
  - https://www.scala-lang.org/download
  - run curl command for your processor
  - `sudo apt install scala`
  - `scala -version`
    - Scala code runner version 2.11.12
  - `scala hello.scala` got "error: Compile server encountered fatal condition: javax/tools/DiagnosticListener"
    - probably an incompatibility of JDK``` and Scala
  - `sdk install java 11.0.20-tem`
  - then had to install scala-cli
    - https://scala-cli.virtuslab.org/install
    - worked, execute scripts: `scala-cli run ex010-hello.scala`


- Windows (didn't work)
  - https://www.scala-lang.org/download
  - ran the downloaded .exe but got: java.nio.file.InvalidPathException: Illegal char <:> at index 109:

## Compatibility

- ✔️ tested on Windows
- ✔️ tested on Ubuntu

## More Datapod templates and sites

https://datapod-tanguay-eu.vercel.app
