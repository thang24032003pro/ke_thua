@echo off
REM Define a doskey macro 'gp' to run add, commit, push in one macro.
REM Usage: gp "commit message"
doskey gp=git add . $T git commit -m $* $T git push origin main
REM End
