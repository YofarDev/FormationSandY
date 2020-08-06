package `9`

// Assignez la classe absstraite et les interfaces aux classes qui sont censés en hériter
// selon les règles du jeu d'échecs.

// Vous rajouterez également à la classe abstraite
//      1) Une variable id de type string
//         (un identifiant qui sera une lettre pour chaque catégorie de piece :
//          P - N - B - R - Q - K) que vous assignerez dans les classes correspondantes
//
//      2) Un moyen d'identifier la couleur (blanche ou noire) de la piece, qui ne sera
//          précisé qu'au moment de l'instanciation de l'objet, et donc pas dans la classe

abstract class Piece

class Pawn
class Knight
class Bishop
class Rook
class Queen
class King

interface StraightMovement
interface DiagonalMovement
interface KnightMovement

