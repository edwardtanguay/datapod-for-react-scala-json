# datapod-for-react-scala-json

This is a simple datapod template for a local site that displays data from a JSON file, which is created by a Scala script that parses a text file.

## Setup

You have to install scala-cli to run the Scala scripts.

- Ubuntu
  - https://scala-cli.virtuslab.org/install

- Windows 
  - https://scala-cli.virtuslab.org/install
  - reboot required

- Note: the "2>$null" in the npm scripts is a Windows-specific option to suppress a warning
  - for Linux/Mac, replace it with "2> /dev/null"
  - or just remove it and you will see a useless warning that the default directory for scala-cli has been set

## Compatibility

- ✔️ tested on Windows
- ✔️ tested on Ubuntu

## More Datapod templates and sites

https://datapod-tanguay-eu.vercel.app
