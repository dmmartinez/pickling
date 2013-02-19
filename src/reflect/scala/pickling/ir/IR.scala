/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2013, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

package scala.pickling
package ir

import scala.reflect.macros.Context


class IRs[C <: Context with Singleton](val ctx: C) {

  trait IR

  case class FieldIR(name: String, tpe: ctx.Type)

  case class ObjectIR(tpe: ctx.Type, fields: List[FieldIR]) extends IR

}