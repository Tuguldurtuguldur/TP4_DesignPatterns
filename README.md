Tuguldur BALTBAATAR U31

Exercice 1 :

1.2 a) Il sera difficile d'ajouter de nouveaux instruments car il y a un problème d'héritage. Si on veut ajouter un nouveau type d'instrument Stringed, il y a les classes Music et Orchestra qui vont changer pour que cette classe soit implémentée.

b) Est-il difficile de réutiliser la classe Orchestra afin de composer une autre Music?

Non ce n'est pas difficile de composer une nouvelle musique car il faudra simplement créer de nouveaux instruments et ajouter des méthodes dans la classe Orchestra.

1.3 Nous pouvons y ajouter de nouvelles classes, cependant il faudra modifier certaines classes pour que le design soit bon. Donc ce design n'est pas conforme au principe ouvert/fermé.

1.5 Le principe d'inversion des dépendances énonce que "les classes de haut niveau ne doivent pas dépendre des sous-classes", dans notre design : la classe Woodwind dépend de Wind alors que Wind ne dépend pas de Woodwind. Le principe des inversions des dépendances est donc respecté.

Exercice 2 :

2.3 a) Il n'est pas difficile de créer de nouveaux instruments car il suffit d'étendre la classe Instrument. Il n'y a pas d'impact sur les autres classes car toutes les autres classes sont déjà des extends d'instrument, même si la classe Brass extends déjà Wind qui elle est à son tour extends de Instrument.

b) Il ne sera pas difficile de réutiliser la classe Orchestra pour composer une autre Musique car il faudra simplement rajouter les nouveaux instruments.

2.4 Dans ce design, on peut y ajouter de nouvelles classes sans avoir besoin de modifier les autres. Donc ce design est conforme au principe ouvert/fermé.

2.6 Le principe d'inversion des dépendances énonce que "les classes de haut niveau ne doivent pas dépendre des sous-classes", dans notre design : la classe Woodwind dépend de Wind alors que Wind ne dépend pas de Woodwind. Le principe des inversions des dépendances est donc respecté.

Exercice 3 :

3.10 a) Il n'est pas difficile de créer de nouveaux instruments car il suffit de créer la nouvelle classe et l'étendre à une classe qui est hérite de la classe Instrument. Si on veut rajouter un instrument, on crée la classe Trompette, on l'extends à la classe Brass puis on l'implement à Soloist.

b) Il ne sera pas difficile de réutiliser la classe Orchestra pour composer une autre Musique car il faudra juste créer une nouvelle class.

3.11 Dans ce design, on peut y ajouter de nouvelles classes sans avoir besoin de modifier les autres. Donc ce design est conforme au principe ouvert/fermé.

3.13 Dans ce nouveau design, on peut y ajouter de nouvelles classes sans avoir besoin de modifier les autres. Donc ce design est conforme au principe ouvert/fermé.

3.14 Les classes ne peuvent jouer que en Tenor ou en Soprano, il ne peut pas être les deux. En implement Soloist, ils ont accès à "playLikeATenor()" et à "playLikeASoprano".* Donc ce design ne respecte pas la ségrégation des interfaces.
