# [java-junit-pit](https://github.com/maioni/java-junit-pit)
A simple calculator Java project with JUnit and PITest support in Eclipse IDE

# install [java JDK](https://openjdk.org/install/)

```bash
sudo apt install openjdk-17-jdk
sudo ln -sfn /usr/lib/jvm/java-1.17.0-openjdk-amd64 /usr/lib/jvm/java-in-use
nano ~/.bashrc
export JAVA_HOME=/usr/lib/jvm/java-in-use
export PATH=$PATH:$JAVA_HOME/bin
source ~/.bashrc
```

# install [eclipse IDE](https://www.eclipse.org/downloads/packages/)

```bash
wget https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2023-03/R/eclipse-jee-2023-03-R-linux-gtk-x86_64.tar.gz -P /tmp
sudo tar xf /tmp/eclipse-*.tar.gz -C /opt
sudo ln -sf /opt/eclipse/eclipse /usr/bin/eclipse
ls -ld /usr/bin/eclipse
which eclipse
```
# update eclipse IDE

```bash
Help > Check for Updates > Install Updates > Agree > Trust > Reload
Help > Eclipse Marketplace… > Installed
```

# install [pitclipse](https://nodejs.org)

```bash
http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1426461
```

# run test cases

```bash
at Eclipse >> RIGHT CLICK at Project >> Run As >> JUnit Test
```

# run mutation test

```bash
at Eclipse >> RIGHT CLICK at Project >> Run As >> PIT Mutation Test
```

# How to setup and guide about this material

- This project: https://github.com/maioni/java-junit-pit

- Medium: https://medium.com/@dmaioni

- Java: https://medium.com/@dmaioni/java-installing-it-8c10f361f4c8

- Java, Junit and Mutation Test: https://medium.com/@dmaioni/java-project-and-junit-test-3b62b28a98b

- Other Documentations:

     - JUnit user guide: https://junit.org/junit5/docs/current/user-guide/

     - PITest quickstart: https://pitest.org/quickstart/

# Thank you!