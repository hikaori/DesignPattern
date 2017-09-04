package comfrom;

/**
 * Created by kaorihirata on 2017-09-03.
 */
//Singleton パターンはsingleton とは一枚札のことです。一枚札とはトランプの一組に唯一のカードです。
// Singleton パターンとは、このような唯一の存在を保証するためのパターンです。
// Singleton パターンは、コンストラクタを private とすることで、
// 他クラスから新たにインスタンスが生成されないような構造とすることで、インスタンスの生成を制御します。
// registerNote は、RegisterNote クラスが初期化されるときに生成されます。
//  クラスが初期化されるタイミングは Java の言語仕様で定義されており、
//  初めてインスタンス化された時や、初めて static メソッドが呼び出されたタイミングなどに行われます。
//  すなわち、このサンプルプログラムでは、staticメソッドであるgetInstance メソッドが初めて呼ばれるときに
//  RegisterNode クラスが初期化され、そのときに一度だけRegisterNode クラスの
//  インスタンスが生成されることになります。
//  この後、getInstance メソッドが呼ばれたときには、
//  既に生成されている registerNote オブジェクトが返されることになります。

public class RegisterNote {
    private static RegisterNote registerNote = new RegisterNote();
    private RegisterNote(){}
    public static RegisterNote getInstance(){
        return registerNote;
    }
}
