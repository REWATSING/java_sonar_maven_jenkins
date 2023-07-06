-----
How I pushed local files to GitHub:

vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git init
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint: 	git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint: 	git branch -m <name>
Initialized empty Git repository in /home/vishnu/Desktop/my-jenkins-java-project/.git/
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git branch -m master
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ ls -la
total 36
drwxrwxr-x  6 vishnu vishnu 4096 Jul  6 11:32 .
drwxr-xr-x 12 vishnu vishnu 4096 Jul  6 11:24 ..
drwxrwxr-x  7 vishnu vishnu 4096 Jul  6 11:32 .git
-rw-rw-r--  1 vishnu vishnu 1499 Jul  6 11:24 pom.xml
-rw-rw-r--  1 vishnu vishnu 1534 Jul  6 11:29 README.txt
drwxrwxr-x  2 vishnu vishnu 4096 Jul  6 11:24 .scannerwork
-rw-rw-r--  1 vishnu vishnu  348 Jul  6 11:24 sonar-project.properties
drwxrwxr-x  4 vishnu vishnu 4096 Jul  6 11:24 src
drwxrwxr-x  7 vishnu vishnu 4096 Jul  6 11:24 target
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git add .
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git status 
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   .scannerwork/.sonar_lock
	new file:   .scannerwork/report-task.txt
	new file:   README.txt
	new file:   pom.xml
	new file:   sonar-project.properties
	new file:   src/main/java/com/example/Main.java
	new file:   src/test/java/com/example/MainTest.java
	new file:   target/classes/com/example/Main.class
	new file:   target/classes/com/example/MainTest.class
	new file:   target/maven-archiver/pom.properties
	new file:   target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst
	new file:   target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst
	new file:   target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/createdFiles.lst
	new file:   target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/inputFiles.lst
	new file:   target/my-local-java-project-1.0-SNAPSHOT.jar

vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git remote add  origin  https://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@github.com/REWATSING/java_sonar_maven_jenkins.git
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git remote set-url origin https://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@github.com/REWATSING/java_sonar_maven_jenkins.git
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git status 
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   .scannerwork/.sonar_lock
	new file:   .scannerwork/report-task.txt
	new file:   README.txt
	new file:   pom.xml
	new file:   sonar-project.properties
	new file:   src/main/java/com/example/Main.java
	new file:   src/test/java/com/example/MainTest.java
	new file:   target/classes/com/example/Main.class
	new file:   target/classes/com/example/MainTest.class
	new file:   target/maven-archiver/pom.properties
	new file:   target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst
	new file:   target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst
	new file:   target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/createdFiles.lst
	new file:   target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/inputFiles.lst
	new file:   target/my-local-java-project-1.0-SNAPSHOT.jar

vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git commit -a -m "Hello committing files from Java Sonar jenkins project from local"
[master (root-commit) 05893ca] Hello committing files from Java Sonar jenkins project from local
 15 files changed, 128 insertions(+)
 create mode 100644 .scannerwork/.sonar_lock
 create mode 100644 .scannerwork/report-task.txt
 create mode 100644 README.txt
 create mode 100644 pom.xml
 create mode 100644 sonar-project.properties
 create mode 100644 src/main/java/com/example/Main.java
 create mode 100644 src/test/java/com/example/MainTest.java
 create mode 100644 target/classes/com/example/Main.class
 create mode 100644 target/classes/com/example/MainTest.class
 create mode 100644 target/maven-archiver/pom.properties
 create mode 100644 target/maven-status/maven-compiler-plugin/compile/default-compile/createdFiles.lst
 create mode 100644 target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst
 create mode 100644 target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/createdFiles.lst
 create mode 100644 target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/inputFiles.lst
 create mode 100644 target/my-local-java-project-1.0-SNAPSHOT.jar
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git status 
On branch master
nothing to commit, working tree clean
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git push -u origin main
error: src refspec main does not match any
error: failed to push some refs to 'https://github.com/REWATSING/java_sonar_maven_jenkins.git'
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git push -u origin master
Enumerating objects: 38, done.
Counting objects: 100% (38/38), done.
Delta compression using up to 4 threads
Compressing objects: 100% (21/21), done.
Writing objects: 100% (38/38), 6.85 KiB | 467.00 KiB/s, done.
Total 38 (delta 0), reused 0 (delta 0), pack-reused 0
remote: 
remote: Create a pull request for 'master' on GitHub by visiting:
remote:      https://github.com/REWATSING/java_sonar_maven_jenkins/pull/new/master
remote: 
To https://github.com/REWATSING/java_sonar_maven_jenkins.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ git status 
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean
vishnu@vishnu:~/Desktop/my-jenkins-java-project$ 

