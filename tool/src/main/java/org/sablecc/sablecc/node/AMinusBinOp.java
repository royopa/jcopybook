/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import java.util.*;
import org.sablecc.sablecc.analysis.*;

public final class AMinusBinOp extends PBinOp
{

  public AMinusBinOp()
  {}
  public Object clone()
  {
    return new AMinusBinOp();
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseAMinusBinOp(this);
  }

  public String toString()
  {
    return "";
  }

  void removeChild(Node child)
  {}

  void replaceChild(Node oldChild, Node newChild)
  {}
}