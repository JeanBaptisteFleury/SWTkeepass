# SWTKeepass
SWTKeepass is an SWT Java 6 app that enables you to open kdbx 4 databases and use your password manager. It uses the [openkeepass](https://github.com/cternes/openkeepass) library written by [cternes](https://github.com/cternes).
## Why
There are a lot of keepass clients lightyears better than this one but none of them is compatible with Windows 2000. I chose to write a client with Java 6 as it will still remain cross platform and remain compatible with Windows 2000. Another alternative would have been to download source code of an early version of KeepassXC that supports kdbx 4 files and compile it with Visual Studio 2008 Express, targetting the v90 toolset which is the latest toolset compatible with Windows 2000.
## Roadmap
 - Be able to open kdbx 4 files and list their content - Copy passwords and usernames to the clipboard - Auto clipboard cleanup - Writing kdbx 4 files

