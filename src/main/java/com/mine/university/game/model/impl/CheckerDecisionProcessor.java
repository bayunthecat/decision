package com.mine.university.game.model.impl;

import com.mine.university.checkers.model.Board;
import com.mine.university.checkers.model.Move;
import com.mine.university.checkers.model.Point;
import com.mine.university.checkers.processing.BoardProcessor;
import com.mine.university.checkers.processing.impl.CheckersBoardProcessor;
import com.mine.university.game.model.DecisionProcessor;
import com.mine.university.game.model.Player;
import com.mine.university.game.model.Strategy;
import com.scalified.tree.TreeNode;
import com.scalified.tree.multinode.ArrayMultiTreeNode;
import org.neuroph.core.NeuralNetwork;

import java.util.Arrays;
import java.util.List;

public class CheckerDecisionProcessor implements DecisionProcessor<NeuralNetwork> {

    //TODO make configurable
    private static final int DEPTH = 4;

    private BoardProcessor<Point> boardProcessor = new CheckersBoardProcessor();

    @Override
    public Move<Point> getNextMove(Board<Point> board, Player player, Strategy<NeuralNetwork> strategy) {
        TreeNode<Double> root = new ArrayMultiTreeNode<>(strategy.evaluateBoard(board));
        TreeNode<Double> tree = buildTree(root, board, strategy, 1);
        return null;
    }

    private TreeNode<Double> buildTree(TreeNode<Double> root,
                                       Board<Point> board,
                                       Strategy<NeuralNetwork> strategy,
                                       int level) {
        List<Move<Point>> availableMoves = boardProcessor.getAvailableMoves(board);
        List<Board<Point>> derivedBoards = boardProcessor.formParentBoards(board, availableMoves);
        double[] evaluations = strategy.evaluateBoards(derivedBoards);
        Arrays.stream(evaluations).forEach(value -> root.add(new ArrayMultiTreeNode<>(value)));
        return root;
    }
}