@echo off
REM Usage: push_update "commit message"
if "%~1"=="" (
  echo Please provide a commit message.
  echo Example: push_update "update"
  exit /b 1
)

git add . && git commit -m "%~1" && git push origin main
