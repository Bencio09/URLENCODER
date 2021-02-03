/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.urlencoder;

/**
 *Classe di utilità per la codifica dei moduli HTML. Questa classe contiene metodi statici per la conversione di una stringa nel formato MIME. Per ulteriori informazioni sulla codifica dei moduli HTML, consultare la specifica HTML. application/x-www-form-urlencoded
 *Quando si codifica una stringa, si applicano le regole seguenti:
 *<ul>
 * <li>I caratteri alfanumerici da "" a "", da "" a "" e da "" a "" rimangono gli stessi. azAZ09</li>
 * <li>I caratteri speciali "", "", "" e "" rimangono gli stessi. .-*_</li>
 * <li>Il carattere spazio "" viene convertito in un segno più "".  +</li>
 * <li>Tutti gli altri caratteri non sono sicuri e vengono prima convertiti in uno o più byte utilizzando uno schema di codifica. Quindi ogni byte è rappresentato dalla stringa di 3 caratteri "", dove xy è la rappresentazione esadecimale a due cifre del byte. Lo schema di codifica consigliato da utilizzare è UTF-8. Tuttavia, per motivi di compatibilità, se non viene specificata una codifica, viene utilizzata la codifica predefinita della piattaforma. %xy</li>
 *</ul>
 * 
 *Ad esempio, utilizzando UTF-8 come schema di codifica, la stringa "La stringa ü@foo-bar" viene convertita in "The+string+%C3%BC%40foo-bar" perché in UTF-8 il carattere ü è codificato come due byte C3 (esadecimale) e BC (esadecimale) e il carattere @ è codificato come un byte 40 (esadecimale).
 * @author loreb
 */
public class URLEncoder extends Object{
    
    /**
     * @deprecated 
     * <i>The resulting string may vary depending on the platform's default encoding. Instead, use the encode(String,String) method to specify the encoding.</i>
     * Translates a string into format. This method uses the platform's default encoding as the encoding scheme to obtain the bytes for unsafe characters.x-www-form-urlencoded
     * @param s String to be translated.
     * @return the translated .String
     */
    public static String encode(String s){
        String translated = null;
        return translated;
    }
    /**
     * Translates a string into format using a specific encoding scheme. This method uses the supplied encoding scheme to obtain the bytes for unsafe characters. application/x-www-form-urlencoded
     * <b>Note: </b>The <a href="http://www.w3.org/TR/html40/appendix/notes.html#non-ascii-chars">World Wide Web Consortium Recommendation</a> states that UTF-8 should be used. Not doing so may introduce incompatibilites.
     * @param s String to be translated.
     * @param enc The name of a suported <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html#charenc">character encoding</a>.
     * @return the translated .String
     * @throws UnsupportedEncodingException
     * If the named encoding is not supported
     * @since 1.4
     * @see URLDecoder.decode(java.lang.String, java.lang.String)
     */
    public static String encode(String s, String enc){
        String translated = null;
        return translated;
    }
    
}
