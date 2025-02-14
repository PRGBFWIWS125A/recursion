public class Tournament {

    public static void main(final String[] args) {
    }

    static TournamentNode addParticipant(final String name, final TournamentNode node) {
        if (node == null) {
            return new TournamentNode(null, null, name, 0);
        }
        if (node.winner() != null) {
            return new TournamentNode(node, new TournamentNode(null, null, name, 0), null, 0);
        }
        final int left = Tournament.countNames(node.left());
        final int right = Tournament.countNames(node.right());
        if (left > right) {
            return new TournamentNode(node.left(), Tournament.addParticipant(name, node.right()), null, 0);
        }
        return new TournamentNode(Tournament.addParticipant(name, node.left()), node.right(), null, 0);
    }

    static int countNames(final TournamentNode node) {
        return 0;
    }

    static void fillDisplay(
        final TournamentNode node,
        final int level,
        final int row,
        final int columnLength,
        final int height,
        final char[][] display
    ) {
    }

    static boolean finished(final TournamentNode root) {
        return false;
    }

    static int getHeight(final TournamentNode node) {
        return 0;
    }

    static int getLengthOfLongestColumn(final TournamentNode node) {
        return 0;
    }

    static int getNumberOfLeaves(final TournamentNode node) {
        return 0;
    }

    static int powerOf2(final int nonNegativeNumber) {
        return 0;
    }

    static TournamentNode readNextResult(final TournamentNode node) {
        if (node.left().winner() != null && node.right().winner() != null) {
            int pointsLeft = Tournament.readPoints(node.left().winner());
            int pointsRight = Tournament.readPoints(node.right().winner());
            while (pointsLeft == pointsRight) {
                System.out.println("Punktzahl darf nicht gleich sein!");
                pointsLeft = Tournament.readPoints(node.left().winner());
                pointsRight = Tournament.readPoints(node.right().winner());
            }
            return new TournamentNode(
                Tournament.setPoints(node.left(), pointsLeft),
                Tournament.setPoints(node.right(), pointsRight),
                pointsLeft > pointsRight ? node.left().winner() : node.right().winner(),
                0
            );
        }
        if (node.left().winner() != null) {
            return new TournamentNode(node.left(), Tournament.readNextResult(node.right()), null, 0);
        }
        if (node.right().winner() != null) {
            return new TournamentNode(Tournament.readNextResult(node.left()), node.right(), null, 0);
        }
        final int left = Tournament.countNames(node.left());
        final int right = Tournament.countNames(node.right());
        if (left > right) {
            return new TournamentNode(node.left(), Tournament.readNextResult(node.right()), null, 0);
        }
        return new TournamentNode(Tournament.readNextResult(node.left()), node.right(), null, 0);
    }

    static TournamentNode readParticipants() {
        return null;
    }

    static int readPoints(final String name) {
        return 0;
    }

    static int rowOffset(final int level, final int height) {
        return 0;
    }

    static TournamentNode setPoints(final TournamentNode node, final int points) {
        return null;
    }

    static void showCurrentState(final TournamentNode root) {
    }

    static char[][] toDisplay(final TournamentNode root) {
        return null;
    }

}
