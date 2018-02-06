/*
 * Copyright (c) 2017 Sequencing Analysis Support Core - Leiden University Medical Center
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.biopet.tools.refflatsstats

import java.io.File

import nl.biopet.utils.tool.{AbstractOptParser, ToolCommand}

class ArgsParser(toolCommand: ToolCommand[Args])
    extends AbstractOptParser[Args](toolCommand) {
  opt[File]('a', "annotationRefflat") required () maxOccurs 1 valueName "<file>" action {
    (x, c) =>
      c.copy(refflatFile = x)
  } text "The refflat file used for annotation"
  opt[File]('R', "referenceFasta") required () maxOccurs 1 valueName "<file>" action {
    (x, c) =>
      c.copy(referenceFasta = x)
  } text "The reference fasta file"
  opt[File]('g', "geneOutput") required () maxOccurs 1 valueName "<file>" action {
    (x, c) =>
      c.copy(geneOutput = x)
  } text "Ouput file for genes"
  opt[File]('t', "transcriptOutput") required () maxOccurs 1 valueName "<file>" action {
    (x, c) =>
      c.copy(transcriptOutput = x)
  } text "Output file for transcripts"
  opt[File]('e', "exonOutput") required () maxOccurs 1 valueName "<file>" action {
    (x, c) =>
      c.copy(exonOutput = x)
  } text "Output file for exons"
  opt[File]('i', "intronOutput") required () maxOccurs 1 valueName "<file>" action {
    (x, c) =>
      c.copy(intronOutput = x)
  } text "Output file for introns"
}