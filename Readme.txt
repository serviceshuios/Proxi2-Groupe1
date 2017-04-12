Attention, pour utiliser l'executable, vous avez besoin d'une jvm installé et connecté a votre environnement.suivre les etapes ci dessous avant d'essayer d'executer le programme.
===> Aller sur le site d'oracle : http://www.oracle.com/technetwork/java/javase/downloads/index.html
Dans l'onglet download , choisir le JRE,
Accepter la license avant de choisir le modele pour votre systeme d'exploitation,
(pour connaitre votre systeme 64 ou 32 (= 86 sur le site), aller a cet url et suivre le tuto selon votre version de window : http://www.commentcamarche.net/faq/19107-32-ou-64-bits-comment-savoir 
telecharger et installer.

===> mettre votre variable environnement a jour:
ouvrir le panneau de configuration->systeme->avancé , vous devriez voir sur la gauche un bouton nommé variables d'environnement.
cliquez dessus et dans la nouvelle fenetre, partie inferieur, vous devriez voir un bouton nommé Variables d'environnement.
cliquez dessus et dans la partie inferieur nommé variables systeme, chercher la variable "Path"
une fois selectionner, cliquer sur modifier pour ajouter le chemin de votre JRE.(Recuperez le chemin d'acces au fichier java.exe dans le repertoire bin/ de la JRE)
ne supprimez rien et allez au bout de tout ce qui est ecrit, ajouter un ";" puis copier coller le chemin d'acces a votre java.exe.
sauvegarder en cliquant sur ok.

===>pour disposer du projet, installer git(https://git-for-windows.github.io/). ensuite, depuis la commande prompt, choisir l'endroit ou vous voulez installer le projet et taper : git clone https://github.com/serviceshuios/Proxi2-Groupe1.git

===>vous devez importer les bases de données dans phpmyadmin, pour se faire, installer Wamp: http://www.wampserver.com/
une fois installer, il se lance en bas a droite de votre ecran principal(a coter de lheure) cliquer gauche dessus et aller sur phpmyadmin.
une fois sur le site(login = root, pas de mot de passe par default), cliquer sur import=>parcourir=>endroit ou vous avez mis proxibanquev2.sql
si tout se passe bien, cela doit vous créé 3 tables: client, compte, conseilleclient

===> Pour lancer l'application, aller dans l'invit de commande window, taper cd ou dir et le chemin d'acces a l'executable que vous aurez préalablement installé(.jar)(exemple cd C:\Users\truc\projet)
une fois au meme niveau que le .war, entrer java -war chemindufichier\ProxiBanqueV2.war(je suppose).

===> Pour consulter la documentation (javadoc),Double-cliquer sur le fichier index.html se trouvant dans le repertoire "doc" livré avec le fichier jar.



