Free German Dictionary Readme
=============================
janschreiber 
https://sourceforge.net/u/janschreiber/profile/

What is it?
¯¯¯¯¯¯¯¯¯¯¯
That's easy enough to answer: A list of German words as plain text file
with slightly more than 1.9 million entries (including inflected forms).
The format is one word per line, alphabetically ordered, ANSI-encoded 
(Latin-1), with Windows line endings (CR-LF).
It is mainly distributed as a 7-Zip archive (german.7z).
Other downloads available include binary Aspell dictionaries, for both 
German and Swiss spelling (aspell_dict.zip), and a version that works
with the free editor PSPad (PSPad.7z).


How was it made?
¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
The short answer is: basically by running Hunspell on a huge corpus. For 
a somewhat longer version, please refer to "Quellen und Methoden.txt" 
(in German) for now. I'm in the process of writing a Medium 
article with more details on how I made this.


What is it good for?
¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
That's another easy question. It can be used for all kinds of purposes,
including dictionary attacks on weak passwords, but also autocompletion, 
word games, and such. Its chief purpose, however, is to be used as the 
main dictionary for the free command-line based spell checker GNU Aspell. 
That's why most entries were, and all forthcoming entries will be, very 
carefully spell-checked.


GNU Aspell? Why would I want to use that instead of Hunspell?
¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
Most modern spell-checking software uses advanced algorithms that allow
for compound words, such as the (in)famous "Donaudampfschifffahrts-
gesellschaftskapitänsmützenabzeichen." While this is undeniably an
advantage over the list-based approach taken by Aspell, the downside
of it is that a large number of misspellings will not be detected unless
they are expressly blacklisted. "Vorgesetze," "Währungsfond," "National-
soziallisten," "Uhrlaubantrag" are cases in point. Most spell checkers do
not recognize those as errors, but Aspell does. On the minus side, there
will inevitably be plenty of false positives, even with a huge dictionary
like this one.


How to use the word list as input for Aspell
¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
Obviously, you'll need GNU Aspell as a prerequisite. Get it from
http://aspell.net

Most Windows users will want to download the binary Win32 port
and the precompiled German dictionaries by Björn Jacke, available from
http://aspell.net/win32/

Install both to a directory of your choice, in an MS Windows environment
preferably something like %PROGRAMFILES%\aspell\

After completing the installation process, navigate to your aspell\bin
directory in a command line and type:

	aspell --lang=de create master ./de-only.rws < path\to\german.dic

This will create the file de-only.rws, which you should move to the
aspell\dict folder, replacing the one that comes with Björn's German
language pack for Aspell.

If you want a more tolerant check, get the file
http://sourceforge.net/p/germandict/code/HEAD/tree/variants.dic
and merge it into the word list before compiling. Be warned that this
file contains some words that aren't correct according to Duden, though.

Rather than compiling the dictionary for yourself, you may want to 
download my precompiled Aspell dictionary files provided at
http://sourceforge.net/projects/germandict/files/aspell_dict_bin_windows.zip
(compiled with Aspell 0.50.3 on 32-bit Windows).
Just copy the contents of the archive to the dict subfolder of your
Aspell installation.


Looks like a lot of tedious work. Can I help?
¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
Yes. The Austrian and Swiss word lists are quite poor and need 
someone to look after them, for one thing. Also, you could help 
by proofreading various lists with tens of thousands of words. 
Contact me via the forum or janschreiber (at) users.sf.net.
And I never say no to a user dictionary sent via email.


Credits
¯¯¯¯¯¯¯
This project is a dwarf on the shoulders of giants. Thanks to:
- Kevin Atkinson (GNU Aspell)
- László Németh (Hunspell)
- Björn Jacke (igerman98 dictionaries)
- Franz Michael Baumann (extended "DE-frami" Hunspell dictionary)
- Marcin Milkowski and Daniel Naber (LanguageTool)
- Wolfgang Lezius (Morphy)
- Jan Fiala (PSPad)
- Don Ho (Notepad++)
- Jens Lorenz (old spell checker for Notepad++)
- Sergey Semushin (newer DSpellCheck plugin for Notepad++)
- Kim Haskell and Denis G. Sureau (Dictionary maker tools)
- Matthias Hüning (TextSTAT)
- Jimbo Wales and the Wikipedia community (Wikipedia)
- various OpenThesaurus.de contributors (old Joe and Synonymfresser in particular)
- canoo.net (online dictionary)
