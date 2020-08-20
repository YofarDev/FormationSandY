package c9.solution

abstract class Piece(var id: String, var isWhite: Boolean)

class Pawn(isWhite: Boolean) : Piece("P", isWhite), StraightMovement, DiagonalMovement
class Knight(isWhite: Boolean) : Piece("N", isWhite), KnightMovement
class Bishop(isWhite: Boolean) : Piece("B", isWhite), DiagonalMovement
class Rook(isWhite: Boolean) : Piece("R", isWhite), StraightMovement
class Queen(isWhite: Boolean) : Piece("Q", isWhite), StraightMovement, DiagonalMovement
class King(isWhite: Boolean) : Piece("K", isWhite), StraightMovement, DiagonalMovement

interface StraightMovement
interface DiagonalMovement
interface KnightMovement

