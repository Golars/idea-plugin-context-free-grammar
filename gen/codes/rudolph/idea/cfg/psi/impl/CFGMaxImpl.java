// This is a generated file. Not intended for manual editing.
package codes.rudolph.idea.cfg.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static codes.rudolph.idea.cfg.psi.CFGTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import codes.rudolph.idea.cfg.psi.*;

public class CFGMaxImpl extends ASTWrapperPsiElement implements CFGMax {

  public CFGMaxImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CFGVisitor visitor) {
    visitor.visitMax(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CFGVisitor) accept((CFGVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CFGMaxValue getMaxValue() {
    return findNotNullChildByClass(CFGMaxValue.class);
  }

}