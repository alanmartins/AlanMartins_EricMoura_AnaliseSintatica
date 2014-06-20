@ Echo off
cd /d %~dp0 
cd ..\
rd lexer /s /q
rd parser /s /q
rd analysis /s /q
rd node /s /q