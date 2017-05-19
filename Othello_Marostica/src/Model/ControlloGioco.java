/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * Intefaccia che definisce il comportamento generale di riga - colonna - colore di tutte le pedine
 */
public interface ControlloGioco {
    public boolean ControlDisco(int riga, int colonna, boolean colore);
}


/*

	        for(x=0; x<8; x++){
428
	            direction[x]=false;
429
	        }
430
	        if(board[col][row]!=0){
431
	            return false;
432
	        }
433
	        else{
434
	            if(col>1&&board[col-1][row]==-color){
435
	                for(x=col-2;x>0&&board[x][row]==-color;x--);
436
	                if(board[x][row]==color){
437
	                    direction[left]=true;
438
	                }
439
	            }
440
	            if (col< 6 && board[col+1][row] == -color) {
441
	                 for (x = col+2; x < 7 && board[x][row] == -color; x++);
442
	                 if (board[x][row] == color) {
443
	                    direction[right] = true;
444
	                }
445
	            }
446
	            if (row > 1 && board[col][row-1] == -color) {
447
	                for (y = row-2; y > 0 && board[col][y] == -color; y--);
448
	                if (board[col][y] == color) {
449
	                    direction[upper] = true;
450
	                }
451
	            }
452
	            if (row < 6 && board[col][row+1] == -color) {
453
	                for (y = row+2; y < 7 && board[col][y] == -color; y++);
454
	                if (board[col][y] == color) {
455
	                     direction[lower] = true;
456
	                }
457
	            }
458
	            if (col > 1 && row > 1 && board[col-1][row-1] == -color) {
459
	                for (x = col-2, y = row-2; x > 0 && y > 0 && board[x][y] == -color; x--, y--);
460
	                if (board[x][y] == color) {
461
	                    direction[upperleft] = true;
462
	                }
463
	            }
464
	            if (col < 6 && row > 1 && board[col+1][row-1] == -color) {
465
	                for (x = col+2, y = row-2; x < 7 && y > 0 && board[x][y] == -color; x++, y--);
466
	                if (board[x][y] == color) {
467
	                    direction[upperright] = true;
468
	                }
469
	            }
470
	            if (col < 6 && row < 6 && board[col+1][row+1] == -color) {
471
	                for (x = col+2, y = row+2; x < 7 && y < 7 && board[x][y] == -color; x++, y++);
472
	                if (board[x][y] == color) {
473
	                    direction[lowerright] = true;
474
	                }
475
	            }
476
	            if (col > 1 && row < 6 && board[col-1][row+1] == -color) {
477
	                for (x = col-2, y = row+2; x > 0 && y < 7 && board[x][y] == -color; x--, y++);
478
	                if (board[x][y] == color) {
479
	                    direction[lowerleft] = true;
480
	                }
481
	            }
482
	            for (x = 0; x < 8; x++){
483
	                if (direction[x] == true){
484
	                    return true;
485
	                }
486
	            }
487
	            return false;
}
*/