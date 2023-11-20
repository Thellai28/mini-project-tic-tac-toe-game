package models.strategies.playingStrategies;

import models.boardDetails.Board;
import models.boardDetails.Cell;
import models.boardDetails.CellStatus;
import models.game.Move;
import models.strategies.playingStrategies.BotPlayingStrategy;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {
        for( int row = 0; row < board.getDimensions(); row++ ){
            for( int col = 0; col < board.getDimensions(); col++ ){
                Cell cell = board.getBoard().get(row).get(col);
                if( cell.getCellStatus().equals(CellStatus.EMPTY) ){
                    return new Move(cell, null);
                }
            }
        }
        return null;
    }

    public static class MediumBotPlayingStrategy implements BotPlayingStrategy {
        @Override
        public Move makeMove(Board board) {
            return null;
        }
    }
}
