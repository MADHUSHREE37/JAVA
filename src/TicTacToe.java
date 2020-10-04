import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
    private JPanel TicTacToe;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JLabel Label;
    private JButton RELOADButton;
    private JButton RESETButton;
    private JLabel Player1;
    private JLabel Player2;
    private JLabel PlayerTurn;
    char[][] board = new char[3][3];
    int turn=0;
    int P1Score=0;
    int P2Score = 0;
    boolean checkWinner(char Symbol)
    {
      for(int i=0;i<3;i++)
      { //row
          if((board[i][0]==Symbol)&&(board[i][1]==Symbol)&&(board[i][2]==Symbol))
          {
              return true;
          }
          //column
          if((board[0][i]==Symbol)&&(board[1][i]==Symbol)&&(board[2][i]==Symbol))
          {
              return true;
          }
      }
        if((board[0][0]==Symbol)&&(board[1][1]==Symbol)&&(board[2][2]==Symbol))
        {
            return true;
        }
        if((board[0][2]==Symbol)&&(board[1][1]==Symbol)&&(board[2][0]==Symbol))
        {
            return true;
        }
        return  false;
    }

    public void lockBoard()
    {
        for(int i=0;i<9;i++)
        {
            TicTacToe.getComponent(i).setEnabled(false);

        }
    }
    public void unlockBoard()
    {
        for(int i=0;i<9;i++)
        {
            TicTacToe.getComponent(i).setEnabled(true);

        }
        button1.setText("");
        button2.setText("");
        button3.setText("");

        button4.setText("");
        button5.setText("");
        button6.setText("");

        button7.setText("");
        button8.setText("");
        button9.setText("");

        turn=0;
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                board[i][j]=' ';
            }
        }
    }

    public TicTacToe()
    {

        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turn =0;
                P1Score=0;
                P2Score=0;
                unlockBoard();
                Player1.setText("Player1 Score:0");
                Player2.setText("Player2 Score:0");
                PlayerTurn.setText("Player Turn"+(turn+1));
            }
        });
        RELOADButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unlockBoard();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button1.setEnabled(false);
                    button1.setText("O");
                    board[0][0]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button1.setEnabled(false);
                    button1.setText("X");
                    board[0][0]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button2.setEnabled(false);
                    button2.setText("O");
                    board[0][1]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button2.setEnabled(false);
                    button2.setText("X");
                    board[0][1]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button3.setEnabled(false);
                    button3.setText("O");
                    board[0][2]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button3.setEnabled(false);
                    button3.setText("X");
                    board[0][2]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button4.setEnabled(false);
                    button4.setText("O");
                    board[1][0]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button4.setEnabled(false);
                    button4.setText("X");
                    board[1][0]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button5.setEnabled(false);
                    button5.setText("O");
                    board[1][1]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button5.setEnabled(false);
                    button5.setText("X");
                    board[1][1]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button6.setEnabled(false);
                    button6.setText("O");
                    board[1][2]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button6.setEnabled(false);
                    button6.setText("X");
                    board[1][2]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button7.setEnabled(false);
                    button7.setText("O");
                    board[2][0]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button7.setEnabled(false);
                    button7.setText("X");
                    board[2][0]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button8.setEnabled(false);
                    button8.setText("O");
                    board[2][1]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button8.setEnabled(false);
                    button8.setText("X");
                    board[2][1]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turn % 2==0)
                {
                    //player1
                    button9.setEnabled(false);
                    button9.setText("O");
                    board[2][2]='O';
                    if(checkWinner('O'))
                    {
                        lockBoard();
                        P1Score++;
                        Player1.setText("Player1 Score:"+P1Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
                else
                {
                    button9.setEnabled(false);
                    button9.setText("X");
                    board[2][2]='X';
                    if(checkWinner('X'))
                    {
                        lockBoard();
                        P2Score++;
                        Player2.setText("Player2 Score:"+P2Score);
                    }
                    turn++;
                    PlayerTurn.setText("Player Turn:"+((turn%2)+1));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToe");
        frame.setContentPane(new TicTacToe().TicTacToe);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
