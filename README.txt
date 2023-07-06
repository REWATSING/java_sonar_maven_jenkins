------
How I pushed local files to GitHub: 
vishnu@vishnu:~/Desktop/my-local-java-project$ touch README.txt; git add README.txt
vishnu@vishnu:~/Desktop/my-local-java-project$ git status 
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
	new file:   README.txt

vishnu@vishnu:~/Desktop/my-local-java-project$ git commit -m "Hello committing README.txt file from Java Sonar project from local"
[main 807f3f6] Hello committing README.txt file from Java Sonar project from local
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.txt
vishnu@vishnu:~/Desktop/my-local-java-project$ git remote set-url origin  https://<PAT>@github.com/REWATSING/java-sonar-local.git
vishnu@vishnu:~/Desktop/my-local-java-project$ git push -u origin main
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 4 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 309 bytes | 309.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/REWATSING/java-sonar-local.git
   0dd4fa1..807f3f6  main -> main
Branch 'main' set up to track remote branch 'main' from 'origin'.
vishnu@vishnu:~/Desktop/my-local-java-project$ git status 
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean
vishnu@vishnu:~/Desktop/my-local-java-project$ 
