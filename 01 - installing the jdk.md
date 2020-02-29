# Download and Install the JDK
- navigate to [amazon coretto web page](https://aws.amazon.com/corretto/)
- download the `amazon coretto 11`
- install the jdk

# IntelliJ IDEA Setup
- from the `main screen` of ide:
- `Configure` > `Structure for New Projects`
- click `Project` on the left panel
- on the right window, click `New` button which next to `<No SDK>`
- select `JDK` from dropdown
- ide will found current installation of jdk
- but if not navigate to `/Library/Java/JavaVirtualMachines`
- choose the jdk version you want to use, and navigate to `<version>/Contents/Home`
- final path will be like `/Library/Java/JavaVirtualMachines/<version>/Contents/Home`
- click ok
- you can edit the name if you want from same screen by clicking `Edit` button

# Additional IntelliJ IDEA Setup
- from the `main screen` of ide:
- `configure` > `preferences` > `editor` > `general` > `appearance` > check `show line numbers`
- `configure` > `preferences` > `editor` > `general` > `code folding` >
  - uncheck `imports`
  - uncheck `one-line methods`
  - uncheck `closures`
  - uncheck `generic constructor and method parameters`
- `configure` > `preferences` > `editor` > `general` > `auto import` >
  - check `add unambiguous imports on the fly`
  - check `optimize imports on the fly`

# Project Setup on IntelliJ IDEA Setup
- from `file` > `project structure` make sure project has correct sdk