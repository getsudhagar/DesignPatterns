# DesignPatterns
Observed design patterns in java source code.

#Factory
  javax.xml.parsers.DocumentBuilderFactory.newInstance()
  javax.xml.xpath.XPathFactory.newInstance()
  java.util.Calendar.getInstance()

#Singleton
  java.lang.Runtime.getRuntime()
  java.lang.System.getSecurityManager()

#Decorator
  Subclasses of java.io.InputStream, OutputStream, Reader and Writer.
  java.util.Collections.checked---(), synchronized---() and unmodifiable---().
 
#Chain of responsibility 
  java.util.logging.Logger.log()
  javax.servlet.Filter.doFilter()