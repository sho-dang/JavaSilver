package silver.practice;
/** 
 * moduleとは情報を隠蔽するために利用
 * モジュールというシステムはpackageという単位でのアクセス制御をしたい時に使う
 * 公開パッケージと非公開パッケージを制御する
 * 書き方は４種類
 * 主に２種類を使う　使うモジュール　公開するモジュール
 * 
*/

/**
 * Packageは
 * 　名前空間を提供する
 * 　アクセス修飾子と組み合わせてアクセス制御を行う
 * 　
*/
import java.io.*;

public class Practice1{

    protected int num = 10;
}