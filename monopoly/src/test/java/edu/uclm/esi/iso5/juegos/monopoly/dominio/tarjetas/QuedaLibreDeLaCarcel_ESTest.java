/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 01 19:42:44 GMT 2016
 */

package edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.Jugador;
import edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class QuedaLibreDeLaCarcel_ESTest extends QuedaLibreDeLaCarcel_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 11 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: root-Branch
   * Goal 2. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel:<init>()V
   * Goal 3. operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I_java.lang.NullPointerException_IMPLICIT
   * Goal 4. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: Line 18
   * Goal 5. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: Line 21
   * Goal 6. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V
   * Goal 7. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I
   * Goal 8. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V
   * Goal 9. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp Negation of tipoDeTarjeta
   * Goal 10. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp IINC 1 tipoDeTarjeta
   * Goal 11. Weak Mutation 2: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp IINC -1 tipoDeTarjeta
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuedaLibreDeLaCarcel quedaLibreDeLaCarcel0 = new QuedaLibreDeLaCarcel();
      // Undeclared exception!
      try { 
        quedaLibreDeLaCarcel0.operaciones((Jugador) null, (-2374));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel", e);
      }
  }

  //Test case number: 1
  /*
   * 26 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: root-Branch
   * Goal 2. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: I10 Branch 1 IF_ICMPNE L22 - false
   * Goal 3. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel:<init>()V
   * Goal 4. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: I10 Branch 1 IF_ICMPNE L22 - false in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel:operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I
   * Goal 5. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:Positive
   * Goal 6. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: Line 18
   * Goal 7. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: Line 21
   * Goal 8. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: Line 22
   * Goal 9. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: Line 23
   * Goal 10. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V
   * Goal 11. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I
   * Goal 12. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V
   * Goal 13. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I
   * Goal 14. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp Negation of tipoDeTarjeta
   * Goal 15. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp IINC 1 tipoDeTarjeta
   * Goal 16. Weak Mutation 2: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp IINC -1 tipoDeTarjeta
   * Goal 17. Weak Mutation 3: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - InsertUnaryOp Negation of tipoDeTarjeta
   * Goal 18. Weak Mutation 4: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - InsertUnaryOp IINC 1 tipoDeTarjeta
   * Goal 19. Weak Mutation 5: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - InsertUnaryOp IINC -1 tipoDeTarjeta
   * Goal 20. Weak Mutation 6: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - ReplaceConstant - 1 -> 0
   * Goal 21. Weak Mutation 7: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - ReplaceComparisonOperator != -> ==
   * Goal 22. Weak Mutation 8: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:23 - ReplaceConstant - 7 -> 0
   * Goal 23. Weak Mutation 9: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:23 - ReplaceConstant - 7 -> 1
   * Goal 24. Weak Mutation 10: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:23 - ReplaceConstant - 7 -> -1
   * Goal 25. Weak Mutation 11: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:23 - ReplaceConstant - 7 -> 6
   * Goal 26. Weak Mutation 12: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:23 - ReplaceConstant - 7 -> 8
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QuedaLibreDeLaCarcel quedaLibreDeLaCarcel0 = new QuedaLibreDeLaCarcel();
      Jugador jugador0 = new Jugador("m#bzk6J");
      int int0 = quedaLibreDeLaCarcel0.operaciones(jugador0, 1);
      assertTrue(jugador0.tieneTarjetaDeSalirDeLaCarcel());
      assertEquals(7, int0);
  }

  //Test case number: 2
  /*
   * 26 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: root-Branch
   * Goal 2. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: I10 Branch 1 IF_ICMPNE L22 - true
   * Goal 3. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel:<init>()V
   * Goal 4. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: I10 Branch 1 IF_ICMPNE L22 - true in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel:operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I
   * Goal 5. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:Positive
   * Goal 6. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: Line 18
   * Goal 7. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: Line 21
   * Goal 8. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: Line 22
   * Goal 9. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I: Line 24
   * Goal 10. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V
   * Goal 11. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I
   * Goal 12. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V
   * Goal 13. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I
   * Goal 14. Weak Mutation 0: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp Negation of tipoDeTarjeta
   * Goal 15. Weak Mutation 1: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp IINC 1 tipoDeTarjeta
   * Goal 16. Weak Mutation 2: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:21 - InsertUnaryOp IINC -1 tipoDeTarjeta
   * Goal 17. Weak Mutation 3: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - InsertUnaryOp Negation of tipoDeTarjeta
   * Goal 18. Weak Mutation 4: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - InsertUnaryOp IINC 1 tipoDeTarjeta
   * Goal 19. Weak Mutation 5: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - InsertUnaryOp IINC -1 tipoDeTarjeta
   * Goal 20. Weak Mutation 6: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - ReplaceConstant - 1 -> 0
   * Goal 21. Weak Mutation 7: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:22 - ReplaceComparisonOperator != -> ==
   * Goal 22. Weak Mutation 13: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:24 - ReplaceConstant - 8 -> 0
   * Goal 23. Weak Mutation 14: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:24 - ReplaceConstant - 8 -> 1
   * Goal 24. Weak Mutation 15: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:24 - ReplaceConstant - 8 -> -1
   * Goal 25. Weak Mutation 16: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:24 - ReplaceConstant - 8 -> 7
   * Goal 26. Weak Mutation 17: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.operaciones(Ledu/uclm/esi/iso5/juegos/monopoly/dominio/Jugador;I)I:24 - ReplaceConstant - 8 -> 9
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QuedaLibreDeLaCarcel quedaLibreDeLaCarcel0 = new QuedaLibreDeLaCarcel();
      Jugador jugador0 = new Jugador("m#bzk6J");
      int int0 = quedaLibreDeLaCarcel0.operaciones(jugador0, 7);
      assertEquals(8, int0);
  }

  //Test case number: 3
  /*
   * 12 covered goals:
   * Goal 1. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: root-Branch
   * Goal 2. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.toString()Ljava/lang/String;: root-Branch
   * Goal 3. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.toString()Ljava/lang/String;: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel:toString()Ljava/lang/String;
   * Goal 4. Branch edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: root-Branch in context: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel:<init>()V
   * Goal 5. [Output]: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.toString()Ljava/lang/String;:NonEmptyString
   * Goal 6. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V: Line 18
   * Goal 7. edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.toString()Ljava/lang/String;: Line 28
   * Goal 8. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V
   * Goal 9. [METHOD] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.toString()Ljava/lang/String;
   * Goal 10. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.<init>()V
   * Goal 11. [METHODNOEX] edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.toString()Ljava/lang/String;
   * Goal 12. Weak Mutation 18: edu.uclm.esi.iso5.juegos.monopoly.dominio.tarjetas.QuedaLibreDeLaCarcel.toString()Ljava/lang/String;:28 - ReplaceConstant - Queda libre de la carcel. -> 
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QuedaLibreDeLaCarcel quedaLibreDeLaCarcel0 = new QuedaLibreDeLaCarcel();
      String string0 = quedaLibreDeLaCarcel0.toString();
      assertEquals("Queda libre de la carcel.", string0);
  }
}
