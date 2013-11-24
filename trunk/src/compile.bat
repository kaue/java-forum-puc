:1
@echo off
cls
echo [  ] Deletando arquivos .class
del /Q /S *.class
echo [OK] Deletando arquivos .class
echo [  ] Compilando projeto
"C:\Program Files\Java\jdk1.7.0_45\bin\javac.exe" App.java
echo [OK] Compilando projeto
echo [OK] Abrindo projeto
java App
goto 1
